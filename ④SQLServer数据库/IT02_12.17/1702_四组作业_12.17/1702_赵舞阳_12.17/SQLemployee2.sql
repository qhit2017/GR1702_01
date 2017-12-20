USE [db_employee]
GO

/****** Object:  Table [dbo].[employee_1]    Script Date: 12/17/2017 19:22:28 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[employee_1](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](16) NOT NULL,
	[remarks] [ntext] NOT NULL,
 CONSTRAINT [PK_employee_1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO


