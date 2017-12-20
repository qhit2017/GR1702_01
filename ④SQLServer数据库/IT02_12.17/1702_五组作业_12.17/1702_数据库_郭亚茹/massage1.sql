USE [db_master]
GO
/****** Object:  Table [dbo].[tb_info]    Script Date: 12/17/2017 17:47:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_info](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[salary] [money] NOT NULL,
	[department] [nvarchar](50) NOT NULL,
	[age] [int] NOT NULL,
	[remarks] [ntext] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
