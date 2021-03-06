USE [db_yangxueting ]
GO
/****** Object:  Table [dbo].[yangxueting]    Script Date: 12/17/2017 19:14:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[yangxueting](
	[id] [nchar](10) NOT NULL,
	[name] [nchar](10) NOT NULL,
	[age] [nchar](10) NOT NULL,
	[salary] [nchar](10) NOT NULL,
	[dateline] [nchar](10) NOT NULL,
	[recommend] [nchar](10) NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remarks] [nchar](10) NOT NULL,
 CONSTRAINT [PK_yangxueting] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
